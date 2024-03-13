public class Lista{
    Cliente first;
    int tamano;


    public Lista(){
        this.first = null;
        this.tamano = 0;
    }

    public void insert(String name, String lastname, int room){
        if(this.first == null){
            this.first = new Cliente(name, lastname, room);

        }else{
            Cliente aux = this.first;
            while(aux.next != null){
                aux=aux.next;
            }
            aux.next = new Cliente(name, lastname, room);
        }
    }

    public void Eliminar(String name, String lastname){
        if(this.first == null){
            this.first = this.first.next;
        }else{
            Cliente aux = this.first;
            while(aux.next != null && aux.next.name != name && aux.next.lastname != lastname){
                aux=aux.next;
            }
            aux.next = aux.next.next;
        } 
    }

    public Cliente buscar(String name, String lastname){
        Cliente aux = this.first;
        if(aux.next != null && aux.next.name == name && aux.next.lastname == lastname){
            return aux; 
        }else{
            Cliente aux = this.first;
            while(aux != null && aux.name != name && aux.lastname != lastname){
                aux=aux.next;
            }
            return aux;
        } 
}