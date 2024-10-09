package com.itbk.Commerce.Entity;
import jakarta.persistence.*;


@Entity
@Table(name = "web_order_quantities")
public class WebOrderQuantities {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @ManyToOne(optional = false)
  @JoinColumn(name = "order_id", nullable = false)
  private WebOrder order;

  public WebOrderQuantities() {
  }

  public WebOrderQuantities(Long id, Product product, Integer quantity, WebOrder order) {
    this.id = id;
    this.product = product;
    this.quantity = quantity;
    this.order = order;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public WebOrder getOrder() {
    return order;
  }

  public void setOrder(WebOrder order) {
    this.order = order;
  }
}
