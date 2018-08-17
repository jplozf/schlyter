package schlyter;
// 20180817
public class fmrTools
{
    static double radeg = 180.0 / Math.PI;

    public static double SinD(double x)
    {
        return (Math.sin(x / radeg));
    }

    public static double CosD(double x)
    {
        return (Math.cos(x / radeg));
    }

    public static double TanD(double x)
    {
        return (Math.tan(x / radeg));
    }

    public static double ASinD(double x)
    {
        return (radeg * Math.asin(x));
    }

    public static double ACosD(double x)
    {
        return (radeg * Math.acos(x));
    }

    public static double ATanD(double x)
    {
        return (radeg * Math.atan(x));
    }
    
    public static double ATan2D(double x, double y)
    {
        return (radeg * Math.atan2(y, x));
    }
    
    /*
    Normalize an angle between 0 and 360 degrees
    */
    public static double Rev(double x)
    {
        return (x - 360.0 * Math.floor(x / 360.0));
    }
    
    /*
    Cube root
    */
    public static double Cbrt(double x)
    {
        if (x > 0.0)
        {
            return (Math.exp(Math.log(x)/ 3.0));
        }
        else
        {
            if (x < 0.0)
            {
                return (-Cbrt(-x));
            }
            else
            {
                return 0.0;
            }
        }
    }
}
