/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter.jaxp;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class StreamSourceConverterLoader implements TypeConverterLoader {

    public StreamSourceConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.io.InputStream.class, javax.xml.transform.stream.StreamSource.class, false,
            (type, exchange, value) -> org.apache.camel.converter.jaxp.StreamSourceConverter.toInputStream((javax.xml.transform.stream.StreamSource) value));
        addTypeConverter(registry, java.io.Reader.class, javax.xml.transform.stream.StreamSource.class, false,
            (type, exchange, value) -> org.apache.camel.converter.jaxp.StreamSourceConverter.toReader((javax.xml.transform.stream.StreamSource) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}