public class DomesticCat extends Pet implements Foulable{
    public DomesticCat(){
        super();
        this.species = Species.DOMESTICCAT;
    }
    @Override
    public void respond(){
        System.out.println("Meow meow");
    }
    @Override
    public void foul(){
        System.out.println("Knocks book off the shelf");
    }
}
