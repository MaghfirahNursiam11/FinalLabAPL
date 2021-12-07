class RatingAdapter implements Nonton
{
    // You need to implement the interface your
    Rating rating;
    public RatingAdapter(Rating rating)
    {
        // we need reference to the object we
        // are adapting
        this.rating = rating;
    }
  
    public void berkata()
    {
        rating.say();
    }
}
