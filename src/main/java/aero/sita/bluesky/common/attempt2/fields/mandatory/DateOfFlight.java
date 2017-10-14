package aero.sita.bluesky.common.attempt2.fields.mandatory;

import aero.sita.bluesky.common.attempt2.fields.RawBcbpField;

public class DateOfFlight extends RawBcbpField {
    // This is julian date format

    public DateOfFlight() {
        size = 3;
    }
}
