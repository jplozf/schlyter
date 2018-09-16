package schlyter;

import java.time.*;
import java.time.format.TextStyle;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.TemporalQueries.localDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class fmrJDate {

    public int fmrYear;
    public int fmrMonth;
    public int fmrDay;
    public int fmrHour;
    public int fmrMinute;
    public int fmrSecond;
    // public double TZV;
    public int fmrZoneOffset;
    // public TimeZone TZ;
    public ZoneId fmrZoneId;
    public double D2000;
    public double OblEcl;
    // public Calendar cal;
    //
    public double JD;       // Julian fmrDay
    public double GMST0;    // Mean Sideral Time at Greenwich
    //
    private ZonedDateTime zdt;

//******************************************************************************
// fmrJDate()
//******************************************************************************
    public fmrJDate() {
        this.zdt = ZonedDateTime.now();
        this.fmrYear = this.zdt.getYear();
        this.fmrMonth = this.zdt.getMonthValue();
        this.fmrDay = this.zdt.getDayOfMonth();
        this.fmrHour = this.zdt.getHour();
        this.fmrMinute = this.zdt.getMinute();
        this.fmrSecond = this.zdt.getSecond();
        this.fmrZoneId = this.zdt.getZone();
        this.fmrZoneOffset = this.zdt.getOffset().getTotalSeconds();
    }

//******************************************************************************
// fmrJDate()
//******************************************************************************
    public fmrJDate(int year, int month, int day, int hour, int minute, int second, ZoneId zoneId) {
        this.zdt = ZonedDateTime.of(year, month, day, hour, minute, second, 0, zoneId);
        this.fmrYear = this.zdt.getYear();
        this.fmrMonth = this.zdt.getMonthValue();
        this.fmrDay = this.zdt.getDayOfMonth();
        this.fmrHour = this.zdt.getHour();
        this.fmrMinute = this.zdt.getMinute();
        this.fmrSecond = this.zdt.getSecond();
        this.fmrZoneId = this.zdt.getZone();
        this.fmrZoneOffset = this.zdt.getOffset().getTotalSeconds();
    }

//******************************************************************************
// fmrJDate()
//******************************************************************************
    public fmrJDate(int year, int month, int day) {
        this.zdt = ZonedDateTime.of(year, month, day, 12, 0, 0, 0, ZoneId.systemDefault());
        this.fmrYear = this.zdt.getYear();
        this.fmrMonth = this.zdt.getMonthValue();
        this.fmrDay = this.zdt.getDayOfMonth();
        this.fmrHour = this.zdt.getHour();
        this.fmrMinute = this.zdt.getMinute();
        this.fmrSecond = this.zdt.getSecond();
        this.fmrZoneId = this.zdt.getZone();
        this.fmrZoneOffset = this.zdt.getOffset().getTotalSeconds();
    }

//******************************************************************************
// getZoneOffset()
//******************************************************************************
    public int getZoneOffset() {
        return (this.zdt.getOffset().getTotalSeconds());
    }

//******************************************************************************
// getYear()
//******************************************************************************
    public int getYear() {
        return this.fmrYear;
    }

//******************************************************************************
// getMonth()
//******************************************************************************
    public int getMonth() {
        return this.fmrMonth;
    }

//******************************************************************************
// getDay()
//******************************************************************************
    public int getDay() {
        return this.fmrDay;
    }

//******************************************************************************
// getHour()
//******************************************************************************
    public int getHour() {
        return this.fmrHour;
    }

//******************************************************************************
// getMinute()
//******************************************************************************
    public int getMinute() {
        return this.fmrMinute;
    }

//******************************************************************************
// getSecond()
//******************************************************************************
    public int getSecond() {
        return this.fmrSecond;
    }

//******************************************************************************
// getDayOfWeek()
//******************************************************************************
    public String getDayOfWeek() {
        return (this.zdt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

//******************************************************************************
// getMonthName()
//******************************************************************************
    public String getMonthName() {
        return (this.zdt.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

//******************************************************************************
// setTime()
//******************************************************************************
    public void setTime(int year, int month, int day, int hour, int minute, int second) {
        this.zdt = ZonedDateTime.of(year, month, day, hour, minute, second, 0, ZoneId.systemDefault());
        this.fmrYear = this.zdt.getYear();
        this.fmrMonth = this.zdt.getMonthValue();
        this.fmrDay = this.zdt.getDayOfMonth();
        this.fmrHour = this.zdt.getHour();
        this.fmrMinute = this.zdt.getMinute();
        this.fmrSecond = this.zdt.getSecond();
        this.fmrZoneId = this.zdt.getZone();
        this.fmrZoneOffset = this.zdt.getOffset().getTotalSeconds();
    }

//******************************************************************************
// setTime()
//******************************************************************************
    public void setTime(int year, int month, int day, int hour, int minute, int second, ZoneId zoneId) {
        this.zdt = ZonedDateTime.of(year, month, day, hour, minute, second, 0, zoneId);
        this.fmrYear = this.zdt.getYear();
        this.fmrMonth = this.zdt.getMonthValue();
        this.fmrDay = this.zdt.getDayOfMonth();
        this.fmrHour = this.zdt.getHour();
        this.fmrMinute = this.zdt.getMinute();
        this.fmrSecond = this.zdt.getSecond();
        this.fmrZoneId = this.zdt.getZone();
        this.fmrZoneOffset = this.zdt.getOffset().getTotalSeconds();
    }

//******************************************************************************
// daysUntil3112()
//******************************************************************************
    public int daysUntil3112() {
        return ((int) DAYS.between(this.zdt, LocalDate.of(this.zdt.getYear(), 12, 31)));
    }

//******************************************************************************
// daysFrom0101()
//******************************************************************************
    public int daysFrom0101() {
        return ((int) DAYS.between(LocalDate.of(this.zdt.getYear(), 1, 1), this.zdt));
    }

//******************************************************************************
// getWeekFromDate()
//******************************************************************************
    public int getWeekFromDate() {
        return (this.zdt.get(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear()));
    }

//******************************************************************************
// getUTCDouble()
//******************************************************************************
    public double getUTCDouble() {
        ZonedDateTime utc = ZonedDateTime.ofInstant(zdt.toInstant(), ZoneId.of("UTC"));
        double dec = 0.0;
        dec += utc.getSecond() / 60.0;
        dec += utc.getMinute() / 60.0;
        dec += utc.getHour();
        // System.out.println("UTC: " + dec);
        return dec;
    }

//******************************************************************************
// reduceAngle()
//******************************************************************************
    public static double reduceAngle(double a) {
        return (a - Math.floor(a / 360.0) * 360.0);
    }

//******************************************************************************
// dd2dms()
//******************************************************************************
    public static String dd2dms(double dd) {
        double d2 = Math.abs(dd);
        double sign = dd / d2;

        double d = Math.floor(d2);
        double t = (d2 - d) * 60.0;
        double m = Math.floor(t);
        double s = (t - m) * 60.0;

        d = sign * d;

        return String.format("%+04d°%02d'%02d\"", (int) d, (int) m, (int) s);
    }

//******************************************************************************
// dd2hms()
//******************************************************************************
    public static String dd2hms(double dd) {
        double d2 = Math.abs(dd);
        double sign = dd / d2;

        double d = d2 / 15.0;
        double h = Math.floor(d);
        double t = (d - h) * 60.0;
        double m = Math.floor(t);
        double s = (t - m) * 60.0;

        return String.format("%02dh %02dm %02ds", (int) h, (int) m, (int) s);
    }

//******************************************************************************
// hd2hms()
//******************************************************************************
    public static String hd2hms(double dd) {
        double d = Math.abs(dd);

        double h = Math.floor(d);
        double t = (d - h) * 60.0;
        double m = Math.floor(t);
        double s = (t - m) * 60.0;

        return String.format("%02dh %02dm %02ds", (int) h, (int) m, (int) s);
    }

//******************************************************************************
// getD2000()
//******************************************************************************
    public double getD2000() {
        int iD = 0;
        double dH;
        double D2000 = 0.0;

        iD = 367 * this.fmrYear - (7 * (this.fmrYear + ((this.fmrMonth + 9) / 12))) / 4 + (275 * this.fmrMonth) / 9 + this.fmrDay - 730530;
        dH = this.fmrHour + (this.fmrMinute / 60.0) + (this.fmrSecond / 3600.0);
        dH = dH - this.fmrZoneOffset;
        dH = dH / 24.0;
        D2000 = (double) iD + dH;

        return D2000;
    }

//******************************************************************************
// getOblEcl()
//******************************************************************************
    public double getOblEcl() {
        return (23.4393 - this.getD2000() * 3.563E-7);
    }

//******************************************************************************
// toString()
//******************************************************************************
    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d %02d:%02d:%02d", this.fmrYear, this.fmrMonth, this.fmrDay, this.fmrHour, this.fmrMinute, this.fmrSecond);
    }

//******************************************************************************
// getJD()
//******************************************************************************
    double getJD() {
        double JD = 0.0;

        int Y = this.fmrYear;
        int M = this.fmrMonth;
        if (M < 3) {
            Y = Y - 1;
            M = M + 12;
        }
        int A = Y / 100;
        int B = 2 - A + (A / 4);
        JD = Math.floor(365.25 * (Y + 4716.0)) + Math.floor(30.6001 * (M + 1.0)) + this.fmrDay + B - 1524.5 + (this.fmrHour / 24.0) + (this.fmrMinute / 1440.0) + (this.fmrSecond / 86400.0);

        return JD;
    }

//******************************************************************************
// getMeanSideralTimeGreenwich()
//******************************************************************************
    public double getMeanSideralTimeGreenwich() {
        double GMST0 = 0.0;
        double JD0 = Math.floor(this.JD) - 0.5;
        double T = (JD0 - 2451545.0) / 36525.0;

        GMST0 = 100.46061837 + 36000.770053608 * T + 0.000387933 * (T * T) - ((T * T * T) / 38710000);
        GMST0 = reduceAngle(GMST0);
        return GMST0;
    }

//******************************************************************************
// getDeltaT()
//******************************************************************************
    double getDeltaT(int year, int month) {
        // https://eclipse.gsfc.nasa.gov/SEhelp/deltatpoly2004.html
        // TODO : complete code from site

        double deltaT = 0.0;
        double y = year + (month - 0.5) / 12.0;
        if (year < -500) {
            double u = (year - 1820.0) / 100.0;
            deltaT = -20.0 + 32.0 * (u * u);
        } else {
            if (year >= -500 && year < 500) {
                double u = y / 100.0;
                deltaT = 10583.6 - 1014.41 * u + 33.78311 * (u * u) - 5.952053 * (u * u * u) - 0.1798452 * (u * u * u * u) + 0.022174192 * (u * u * u * u * u) + 0.0090316521 * (u * u * u * u * u * u);
            } else {
                if (year >= 500 && year < 1600) {
                    double u = (y - 1000.0) / 100.0;
                    deltaT = 1574.2 - 556.01 * u + 71.23472 * (u * u) + 0.319781 * (u * u * u) - 0.8503463 * (u * u * u * u) - 0.005050998 * (u * u * u * u * u) + 0.0083572073 * (u * u * u * u * u * u);
                } else {
                    if (year >= 1600 && year < 1700) {
                        double t = (y - 1600.0);
                        deltaT = 120.0 - 0.9808 * t - 0.01532 * (t * t) + ((t * t * t) / 7129.0);
                    } else {
                        if (year >= 1700 && year < 1800) {

                        } else {
                            if (year >= 1800 && year < 1860) {

                            } else {
                                if (year >= 1860 && year < 1900) {

                                } else {
                                    if (year >= 1900 && year < 1920) {

                                    } else {
                                        if (year >= 1920 && year < 1941) {

                                        } else {
                                            if (year >= 1941 && year < 1961) {

                                            } else {
                                                if (year >= 1961 && year < 1986) {

                                                } else {
                                                    if (year >= 1986 && year < 2005) {

                                                    } else {
                                                        if (year >= 2005 && year < 2050) {

                                                        } else {
                                                            if (year >= 2050 && year < 2150) {

                                                            } else {

                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return deltaT;
    }
}
