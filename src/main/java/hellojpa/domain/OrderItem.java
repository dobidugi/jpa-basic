package hellojpa.domain;

import jakarta.persistence.*;

public class OrderItem {

  @Id @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private Item item;

  private int orderPrice;
  private int count;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(int orderPrice) {
    this.orderPrice = orderPrice;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
