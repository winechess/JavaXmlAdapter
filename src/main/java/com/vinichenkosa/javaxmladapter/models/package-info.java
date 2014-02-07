@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(
        value = UppercaseAdapter.class, 
        type = String.class
    ),
    @XmlJavaTypeAdapter(
        value = StringToDateAdapter.class, 
        type = Date.class
    )
})
package com.vinichenkosa.javaxmladapter.models;

import com.vinichenkosa.javaxmladapter.adapters.StringToDateAdapter;
import com.vinichenkosa.javaxmladapter.adapters.UppercaseAdapter;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;