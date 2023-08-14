package com.educandoweb.curso.entidades.enums;

public enum OrderStatus {
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	POSTADO(3),
	ENTREGUE(4), 
	CANCELADO(5);

	private int codigo;

	OrderStatus(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public static OrderStatus valueOf(int codigo) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCodigo() ==codigo) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código invalido de OrdemStatus");
	}
}
