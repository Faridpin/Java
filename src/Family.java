import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    Pet pet;
    public Family(Human father, Human mother){
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
    }
    public Human getMother(){
        return mother;
    }
    public Human getFather(){
        return father;
    }
    public Human[] getChildren(){
        return children;
    }
    public Pet getPet(){
        return pet;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void setChildren(Human[] children){
        this.children = children;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }


    public void addChild(Human child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        Human[] newChildren = new Human[children.length - 1];

        System.arraycopy(children, 0, newChildren, 0, index);

        if (index < children.length - 1) {
            System.arraycopy(children, index + 1, newChildren, index, children.length - index - 1);
        }

        children = newChildren;

        return true;
    }


    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{mother=" + mother + ", father=" + father + ", children=" + Arrays.toString(children) + ", pet=" + pet + "}";
    }
}

