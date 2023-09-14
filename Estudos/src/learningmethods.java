public class learningmethods {
    

    public static int a(int lista){
        /* Aqui é criada uma variavel local de lista que recebe 50,
        valida somente dentro desse escopo 
        */
        lista = 50;
        return lista;
    }
    public static void main(String[] args) {
    int lista=40;

        a(lista);
        System.out.printf("%d", lista);
        /*porém por mais que a referencia de lista tenha sido alterada, 
        lista, global, continua com seu valor original  */ 
    }
}
