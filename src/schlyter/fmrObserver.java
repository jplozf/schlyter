package schlyter;

public class fmrObserver
{
    private  String obsDescription;
    private  fmrDate obsDate;
    private  fmrLocation obsLocation;
    private  Boolean REAL_TIME;
    
    public fmrObserver(fmrDate obsDate, fmrLocation obsLocation, String obsDescription)
    {
        this.obsDate = obsDate;
        this.obsLocation = obsLocation;
        this.obsDescription = obsDescription;
        this.REAL_TIME = false;
    }
    
    public fmrObserver(fmrLocation obsLocation, String obsDescription)
    {
        this.obsDate = new fmrDate();
        this.obsLocation = obsLocation;
        this.obsDescription = obsDescription;
        this.REAL_TIME = true;
    }
    
    
    public fmrDate getDate()
    {
        if (this.REAL_TIME == true)
        {
            this.obsDate = new fmrDate();
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
