public abstract class Pet {
    protected Species species;
    public Pet(){
        this.species = Species.UNKNOWN;
    }
    public void eat(){
        System.out.println("I am eating");
    }

    public abstract void respond();

    /* public void foul(){
        System.out.println("I need to cover it up");
    }
     */
    }
