package de.novatec.clean.architecture.external.service;


import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class RFC3339DateFormat extends DateFormat {
    private static final long serialVersionUID = 1L;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");
    private final StdDateFormat fmt;

    public RFC3339DateFormat() {
        this.fmt = (new StdDateFormat()).withTimeZone(TIMEZONE_Z).withColonInTimeZone(true);
        this.calendar = new GregorianCalendar();
    }

    public Date parse(String source) {
        return this.parse(source, new ParsePosition(0));
    }

    public Date parse(String source, ParsePosition pos) {
        return this.fmt.parse(source, pos);
    }

    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        return this.fmt.format(date, toAppendTo, fieldPosition);
    }

    public Object clone() {
        return this;
    }
}
