@XmlJavaTypeAdapter(
    value = UppercaseAdapter.class, type = String.class
)
package com.vinichenkosa.javaxmladapter.models;

import com.vinichenkosa.javaxmladapter.adapters.UppercaseAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;