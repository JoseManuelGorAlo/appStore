package entidades;
// Generated 8 feb 2023 11:39:24 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * Comprasrealizadas generated by hbm2java
 */
public class Comprasrealizadas implements java.io.Serializable {

	private Integer compId;
	private Clientes clientes;
	private Productos productos;
	private Tarjetasbancarias tarjetasbancarias;
	private Date compFechaCompra;

	public Comprasrealizadas() {
	}

	public Comprasrealizadas(Date compFechaCompra) {
		this.compFechaCompra = compFechaCompra;
	}

	public Comprasrealizadas(Clientes clientes, Productos productos, Tarjetasbancarias tarjetasbancarias,
			Date compFechaCompra) {
		this.clientes = clientes;
		this.productos = productos;
		this.tarjetasbancarias = tarjetasbancarias;
		this.compFechaCompra = compFechaCompra;
	}

	public Integer getCompId() {
		return this.compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Productos getProductos() {
		return this.productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Tarjetasbancarias getTarjetasbancarias() {
		return this.tarjetasbancarias;
	}

	public void setTarjetasbancarias(Tarjetasbancarias tarjetasbancarias) {
		this.tarjetasbancarias = tarjetasbancarias;
	}

	public Date getCompFechaCompra() {
		return this.compFechaCompra;
	}

	public void setCompFechaCompra(Date compFechaCompra) {
		this.compFechaCompra = compFechaCompra;
	}

}
