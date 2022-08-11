package com.feyl.spring.core.convert.converter;

import cn.hutool.core.lang.Assert;

import java.util.Set;

/**
 * Generic converter interface for converting between two or more types.
 *
 * 通用的转换接口
 *
 * @author Feyl
 */
public interface GenericConverter {

    /**
     * 返回此转换器可以转换的源类型和目标类型。
     */
    Set<ConvertiblePair> getConvertibleTypes();

    /**
     * 将源对象转换为 {@code TypeDescriptor} 描述的目标类型。
     * @param source 要转换的源对象（可能是 {@code null}）
     * @param sourceType 我们要转换的字段的类型描述符
     * @param targetType 我们要转换为的字段的类型描述符
     * @return 转换后的对象
     */
    Object convert(Object source, Class sourceType, Class targetType);

    /**
     * 源到目标类对的持有者。
     */
    final class ConvertiblePair {
        private final Class<?> sourceType;

        private final Class<?> targetType;

        public ConvertiblePair(Class<?> sourceType, Class<?> targetType) {
            Assert.notNull(sourceType, "Source type must not be null");
            Assert.notNull(targetType, "Target type must not be null");
            this.sourceType = sourceType;
            this.targetType = targetType;
        }

        public Class<?> getSourceType() {
            return this.sourceType;
        }

        public Class<?> getTargetType() {
            return this.targetType;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != ConvertiblePair.class) {
                return false;
            }
            ConvertiblePair other = (ConvertiblePair) obj;
            return this.sourceType.equals(other.sourceType) && this.targetType.equals(other.targetType);

        }

        @Override
        public int hashCode() {
            return this.sourceType.hashCode() * 31 + this.targetType.hashCode();
        }
    }
}
