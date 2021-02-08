/**
 * Clase para manejar las entradas de un blog.
 * @author Sergio Vaquero Garcia
 * @version 2.3
 * @since 03/02/2021
 *
 */
public class EntradaBlogSVG {
		/**
		 * Separador es el carácter que separa ENTRADA de nombre del Autor.
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * Constructor de la Clase
		 * 
		 * @param id Identificador de la Entrada al blog
		 * @param autor Autor que realiza la entrada
		 * @param texto Comentario que escribe en el blog
		 * @throws IllegalArgumentException Si el Identificador de la entrada es un valor negativo
		 */
		public EntradaBlogSVG(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		 /** 
         * Imprime por pantalla ENTRADA DE: autor y texto de la entrada del blog
         * @return texto a mostrar por pantalla
         */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		
		/**
		 * Devuelve el número de la entrada.
		 * 
		 * @return id Número de la entrada
		 */
		public int getId(){
			return this.id;
		}
		
		
		/**
		 * Devuelve el texto de la entrada.
		 * 
		 * @return texto Texto completo de la entrada
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * Devuelve el Nombre del Autor de la Entrada.
		 * 
		 * @return autor Nombre del Autor de la entrada en mayúsculas
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/** 
		 * @return Autor: devuelve el nombre del autor.
		 * Metodo que ya no se usa. Ver método getAutor()
		 */
		
		/**
		 * @deprecated Ya no se usa. Mejor ver getAutor
	     * @return autor Nombre del Autor de la Entrada.
	     */
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * Método Principal para probar el Proyecto.
		 * 
		 * @param args No tiene porqué tener argumentos
		 */
		public static void main(String[] args) {
	               
			EntradaBlogSVG e1=new EntradaBlogSVG (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}

}
