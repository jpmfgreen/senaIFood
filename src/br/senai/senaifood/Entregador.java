package br.senai.senaifood;

public class Entregador extends Pessoa {

	private ModalidadeTransporte modalidadeTransporte;

	public Entregador() {
		super(TipoPessoa.ENTREGADOR);
	}

	public ModalidadeTransporte getModalidadeTransporte() {
		return modalidadeTransporte;
	}

	public void setModalidadeTransporte(ModalidadeTransporte modalidadeTransporte) {
		this.modalidadeTransporte = modalidadeTransporte;
	}

}
