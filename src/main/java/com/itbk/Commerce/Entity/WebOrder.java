package com.itbk.Commerce.Entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "web_order")
public class WebOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "user_id", nullable = false)
  private LocalUser user;

  @ManyToOne(optional = false)
  @JoinColumn(name = "address_id", nullable = false)
  private Address address;

  @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, orphanRemoval = true)
  private List<WebOrderQuantities> quantities = new ArrayList<>();

  public WebOrder() {
  }

  public WebOrder(Long id, LocalUser user, Address address, List<WebOrderQuantities> quantities) {
    this.id = id;
    this.user = user;
    this.address = address;
    this.quantities = quantities;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalUser getUser() {
    return user;
  }

  public void setUser(LocalUser user) {
    this.user = user;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<WebOrderQuantities> getQuantities() {
    return quantities;
  }

  public void setQuantities(List<WebOrderQuantities> quantities) {
    this.quantities = quantities;
  }
}
