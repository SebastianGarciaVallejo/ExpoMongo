package co.edu.udea.ProyectoMongo;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Prueba {

	MongoClient mongo;
	public Prueba() {
		mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void añadirDocumento(BasicDBObject documento){
		DB db = mongo.getDB("db-ejemplo"); // creamos bd
		DBCollection table = db.getCollection("Trabajador");
		table.insert(documento);
	}
	
	public DBObject consultar(BasicDBObject document){
		DB db = mongo.getDB("db-ejemplo");
		DBCollection table = db.getCollection("Trabajador");
		return table.findOne(document);
	}

	public static void main(String[] args) {
		// System.out.println("Prueba conexión MongoDB");

	}

	/*
	 * if (mongo != null) { DB db = mongo.getDB("db-ejemplo"); // creamos bd
	 * DBCollection table = db.getCollection("Trabajador"); // creamos
	 * collection
	 * 
	 * BasicDBObject document1 = new BasicDBObject(); document1.put("nombre",
	 * "Jose"); document1.put("apellidos", "Lopez Perez"); document1.put("años",
	 * 45); document1.put("fecha", new Date());
	 * 
	 * BasicDBObject document2 = new BasicDBObject(); document2.put("nombre",
	 * "Maria"); document2.put("apellidos", "Martinez Aguilar");
	 * document2.put("años", 35); document2.put("fecha", new Date());
	 * 
	 * BasicDBObject document3 = new BasicDBObject(); document3.put("nombre",
	 * "Juan"); document3.put("apellidos", "Navarro Robles");
	 * document3.put("años", 25); document3.put("fecha", new Date());
	 * 
	 * BasicDBObject document4 = new BasicDBObject(); document4.put("nombre",
	 * "Lucia"); document4.put("apellidos", "Casas Meca"); document4.put("años",
	 * 66); document4.put("fecha", new Date());
	 * 
	 * BasicDBObject document5 = new BasicDBObject(); document5.put("nombre",
	 * "Jose"); document5.put("apellidos", "Naranjo Moreno");
	 * document5.put("años", 33); document5.put("fecha", new Date());
	 * 
	 * BasicDBObject document6 = new BasicDBObject(); document6.put("nombre",
	 * "Jose Luis"); document6.put("apellidos", "Romero Diaz");
	 * document6.put("años", 55); document6.put("fecha", new Date());
	 * 
	 * BasicDBObject document7 = new BasicDBObject(); document7.put("nombre",
	 * "Ana"); document7.put("apellidos", "Canovas Perez");
	 * document7.put("años", 24); document7.put("fecha", new Date());
	 * 
	 * BasicDBObject document8 = new BasicDBObject(); document8.put("nombre",
	 * "Lucia"); document8.put("apellidos", "Martinez Martinez");
	 * document8.put("años", 67); document8.put("fecha", new Date());
	 * document7.put("fecha", new Date());
	 * 
	 * table.insert(document1); table.insert(document2);
	 * table.insert(document3); table.insert(document4);
	 * table.insert(document5); table.insert(document6);
	 * table.insert(document7); table.insert(document8);
	 * 
	 * BasicDBObject updateAnyos = new BasicDBObject();
	 * updateAnyos.append("$set", new BasicDBObject().append("anyos", 46));
	 * BasicDBObject searchById = new BasicDBObject();
	 * searchById.append("nombre", "Jose"); table.updateMulti(searchById,
	 * updateAnyos); document7.put("fecha", new Date());
	 * 
	 * // Listar de la tabla "trabajador" aquellos que se llamen "Jose"
	 * System.out
	 * .println("Listar los registros de la tabla cuyo nombre sea Jose: ");
	 * BasicDBObject query = new BasicDBObject(); query.put("nombre", "Jose");
	 * DBCursor cur2 = table.find(query); while (cur2.hasNext()) {
	 * System.out.println(" - " + cur2.next().get("nombre") + " " +
	 * cur2.curr().get("apellidos") + " -- " + cur2.curr().get("años") +
	 * " años (" + cur2.curr().get("fecha") + ")"); } System.out.println();
	 * document7.put("fecha", new Date());
	 * 
	 * }
	 */
}
