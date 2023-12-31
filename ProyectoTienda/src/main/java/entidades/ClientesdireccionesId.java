package entidades;
// Generated 8 feb 2023 11:39:24 by Hibernate Tools 4.3.6.Final

/**
 * ClientesdireccionesId generated by hbm2java
 */
public class ClientesdireccionesId implements java.io.Serializable {

	private Integer cdDirId;
	private Integer cdCliId;

	public ClientesdireccionesId() {
	}

	public ClientesdireccionesId(Integer cdDirId, Integer cdCliId) {
		this.cdDirId = cdDirId;
		this.cdCliId = cdCliId;
	}

	public Integer getCdDirId() {
		return this.cdDirId;
	}

	public void setCdDirId(Integer cdDirId) {
		this.cdDirId = cdDirId;
	}

	public Integer getCdCliId() {
		return this.cdCliId;
	}

	public void setCdCliId(Integer cdCliId) {
		this.cdCliId = cdCliId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClientesdireccionesId))
			return false;
		ClientesdireccionesId castOther = (ClientesdireccionesId) other;

		return ((this.getCdDirId() == castOther.getCdDirId()) || (this.getCdDirId() != null
				&& castOther.getCdDirId() != null && this.getCdDirId().equals(castOther.getCdDirId())))
				&& ((this.getCdCliId() == castOther.getCdCliId()) || (this.getCdCliId() != null
						&& castOther.getCdCliId() != null && this.getCdCliId().equals(castOther.getCdCliId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCdDirId() == null ? 0 : this.getCdDirId().hashCode());
		result = 37 * result + (getCdCliId() == null ? 0 : this.getCdCliId().hashCode());
		return result;
	}

}
