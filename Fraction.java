class Fraction {
    int a ; 
    int b ; 
   
    public Fraction (int a , int b ) 
    { 
        this.a=a ; 
        this.b=b; 
        assert a!=0;
    
    }
    public String toString() 
    {
        return Integer.toString (this.a)+"/"+ Integer.toString(this.b) ; 
    }

    }
     
