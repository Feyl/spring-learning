package com.feyl.spring.context.support;

import com.feyl.spring.beans.factory.FactoryBean;
import com.feyl.spring.beans.factory.InitializingBean;
import com.feyl.spring.core.convert.ConversionService;
import com.feyl.spring.core.convert.converter.Converter;
import com.feyl.spring.core.convert.converter.ConverterFactory;
import com.feyl.spring.core.convert.converter.ConverterRegistry;
import com.feyl.spring.core.convert.converter.GenericConverter;
import com.feyl.spring.core.convert.support.DefaultConversionService;
import com.feyl.spring.core.convert.support.GenericConversionService;
import com.sun.istack.internal.Nullable;

import java.util.Set;

/**
 * A factory providing convenient access to a ConversionService configured with
 * converters appropriate for most environments. Set the setConverters
 * "converters" property to supplement the default converters.
 *
 * @author Feyl
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
