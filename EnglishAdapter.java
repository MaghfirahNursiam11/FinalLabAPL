class EnglishAdapter implements Indonesian
{
    // You need to implement the interface your
    // client expects to use.
    English english;
    public EnglishAdapter(English english)
    {
        // we need reference to the object we
        // are adapting
        this.english = english;
    }
  
    public void berkata()
    {
        // translate the methods appropriately
        english.say();
    }
}
