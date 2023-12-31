package com.picpaysimple.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.picpaysimple.domain.user.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User Sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User Receiver;
    private LocalDateTime timestamp;
}   