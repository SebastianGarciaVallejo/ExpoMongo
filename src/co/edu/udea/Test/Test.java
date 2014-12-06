package co.edu.udea.Test;

import static org.junit.Assert.*;

import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import co.edu.udea.ProyectoMongo.Prueba;

public class Test {

	Prueba prueba = new Prueba();

	@org.junit.Test
	public void test() {
		BasicDBObject document = new BasicDBObject();
		document.put("nombre", "Maria");
		document.put("apellidos", "Martinez Aguilar");
		document.put("años", 35);
		document.put("fecha", new Date());
		prueba.añadirDocumento(document);
		DBObject f = prueba.consultar(document);
		assertEquals("Maria",(f.get("nombre")));
	}
}
