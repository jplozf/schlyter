package schlyter;

public class fmrObserver
{
    private  String obsDescription;
    private  fmrJDate obsDate;
    private  fmrLocation obsLocation;
    private  Boolean REAL_TIME;
    
    public fmrObserver(fmrJDate obsDate, fmrLocation obsLocation, String obsDescription)
    {
        this.obsDate = obsDate;
        this.obsLocation = obsLocation;
        this.obsDescription = obsDescription;
        this.REAL_TIME = false;
    }
    
    public fmrObserver(fmrLocation obsLocation, String obsDescription)
    {
        this.obsDate = new fmrJDate();
        this.obsLocation = obsLocation;
        this.obsDescription = obsDescription;
        this.REAL_TIME = true;
    }
    
    
    public fmrJDate getDate()
    {
        if (this.REAL_TIME == true)
        {
            this.obsDate = new fmrJDate();
        }
        return this.obsDate;
    }
    
    public fmrLocation getLocation()
    {
        return this.obsLocation;
    }
    
    public String getDescrition()
    {
        return this.obsDescription;
    }
}
