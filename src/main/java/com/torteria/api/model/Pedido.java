package com.torteria.api.model;

public class Pedido {
    private Long id;
    private String cliente;
    private String torta;
    private Integer cantidad;
    private String comentarios;

    public Pedido() {}

    public Pedido(Long id, String cliente, String torta, Integer cantidad, String comentarios) {
        this.id = id;
        this.cliente = cliente;
        this.torta = torta;
        this.cantidad = cantidad;
        this.comentarios = comentarios;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getTorta() { return torta; }
    public void setTorta(String torta) { this.torta = torta; }

    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }

    public String getComentarios() { return comentarios; }
    public void setComentarios(String comentarios) { this.comentarios = comentarios; }

}
