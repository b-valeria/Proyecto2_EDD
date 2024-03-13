public class Registro{
    Lista[] clientes;
    int tamano;

    public Registro(int size){
        this.tamano = size;
        this.clientes = new Lista[tamano];
    }

    public int Hash(String nombre, String apellido){
        int posicion = 0;

        for(int i = 0; i < nombre.length(); i++){
            posicion += (int) nombre.charAt(i);
        }
        for(int i = 0; i < apellido.length(); i++){
            posicion += (int) apellido.charAt(i);
        }

        return posicion % tamano;

    }

    public void Insert(String name, String lastname, int room){
        int position = Hash(name, lastname);
        clientes[i].insert(name, lastname, room);

    }

    public void Delete(String name, String lastname){
        int position = Hash(name, lastname);
        clientes[i].delete(name, lastname);

    }

    public void Search(String name, String lastname){
        int position = Hash(name, lastname);
        clientes[i].search(name, lastname);
    }

    public String Print(){
        String str = "";
        for(int i = 0; i < tamano; i++){
            if(this.clientes[i].first != null){
                str += this.clientes[i].print();
            }
        }
        return str;
    }


}