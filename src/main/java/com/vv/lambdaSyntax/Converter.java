package com.vv.lambdaSyntax;

public class Converter {

    public String doConversion( ConverterFunction<String, Integer, String> f ) {
        // … valid implementation here
        final String result = f.apply( "a", 20 );
        return result;
    }
}
