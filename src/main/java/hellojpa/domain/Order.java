package hellojpa.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Order {

  @Id @GeneratedValue
  @Column(name = "order_id")
  private Long id;
  @Column(name = "member_id")
  private Long memberId;
  private LocalDateTime orderDate;
  @Enumerated(EnumType.STRING)
  private OrderState status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public OrderState getStatus() {
    return status;
  }

  public void setStatus(OrderState status) {
    this.status = status;
  }
}
