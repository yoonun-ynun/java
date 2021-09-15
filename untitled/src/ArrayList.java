import Inter.List;
import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private static final int _default = 10;
    private static final Object[] empty_array = {};;
    private int size; //요소의 개수
    Object[] array;

    public ArrayList(){
        this.array = empty_array;
        this.size = 0;
    }
    public ArrayList(int capacity){
        this.array = new Object[capacity];
        this.size = 0;
    }
    private void resize(){
        int array_capacity = array.length;
        if(Arrays.equals(array, empty_array)){
            array = new Object[_default];
            return;
        }
        if(size == array_capacity){
            int new_capacity = array_capacity *2;
            array = Arrays.copyOf(array, new_capacity);
            return;
        }
        if(size < (array_capacity/2)){
            int new_capacity = array_capacity/2;
            array = Arrays.copyOf(array, Math.max(new_capacity, _default));
            return;
        }
    }
    @Override
    public boolean add(E value){
        addLast(value);
        return true;
    }
    public void addLast(E value){
        if(size == array.length)
            resize();
        array[size] = value;
        size++;
    }
    @Override
    public void add(int index, E value){
        if(index > size || index <0)
            throw new IndexOutOfBoundsException();
        if(index == size)
            addLast(value);
        else{
            if(size == array.length)
                resize();
        }
        for(int i = size;i>index;i--)
            array[i] = array[i-1];
        array[index] = value;
        size++;
    }
    public void addFirst(E value){
        add(0, value);
    }
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index){
        if(index >= size || index<0)
            throw new IndexOutOfBoundsException();
        return (E) array[index];
    }
    @Override
    public void set(int index, E value){
        if(index >=size || index<0)
            throw new IndexOutOfBoundsException();
        array[index] = value;
    }
    @Override
    public int indexOf(Object value){
        for(int i = 0;i<size;i++) {
            if (array[i].equals(value))
                return i;
        }
        return -1;
    }
    public int lastIndexOf(Object value){
        for(int i = size; i>=0;i--){
            if(array[i].equals(value))
                return i;
        }
        return -1;
    }
    @Override
    public boolean contains(Object value){
        if(indexOf(value)>=0)
            return true;
        else return false;
    }
    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        E element = (E) array[index];
        array[index] = null;
        for(int i = index;i<size;i++){
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        size--;
        resize();
        return element;
    }
    @Override
    public boolean remove(Object value){
        int index = indexOf(value);
        if(index == -1)
            return false;
        remove(index);
        return true;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public void clear(){
        for(int i = 0;i<size;i++)
            array[i] = null;
        size = 0;
        resize();
    }
}