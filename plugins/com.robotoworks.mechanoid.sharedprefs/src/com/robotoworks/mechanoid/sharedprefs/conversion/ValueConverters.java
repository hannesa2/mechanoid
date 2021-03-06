package com.robotoworks.mechanoid.sharedprefs.conversion;

import com.google.inject.Inject;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;

public class ValueConverters extends DefaultTerminalConverters {
    @Inject
    QualifiedNameValueConverter mFQNValueConverter;

    @ValueConverter(rule = "FQN")
    public IValueConverter<String> FQN() {
        return mFQNValueConverter;
    }
}
