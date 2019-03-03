package Collection.Set;

public class MyClassConteiner<T, E> {

    private T Field_1;
    private E Field_2;

    public MyClassConteiner(T field_1, E field_2) {
        this.Field_1 = field_1;
        this.Field_2 = field_2;
    }

    public T getField_1() {
        return Field_1;
    }

    public void setField_1(T field_1) {
        Field_1 = field_1;
    }

    public E getField_2() {
        return Field_2;
    }

    public void setField_2(E field_2) {
        Field_2 = field_2;
    }

    @Override
    public int hashCode() {
        return Field_1.hashCode()*12 + Field_2.hashCode()*13;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;} // сравнение по сслылке в памяьт если ссылки совпадают то объект сравнивает сам себя
        if(obj == null) {return false;} // проверка на нулл
        if(getClass() != obj.getClass()){return false;} //отсеивание по имени класса

        MyClassConteiner other = (MyClassConteiner) obj;
        return this.Field_1 == other.getField_1() && this.Field_2 == other.getField_2();

     }

    @Override
    public String toString() {
        return  Field_1.toString() +" "+ Field_2.toString();
    }


}
