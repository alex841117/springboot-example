package com.kingboy.axon.ticket.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * User kingboy - KingBoyWorld@163.com
 * Date 2018/7/31 02:46
 * Desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketMoveCommand {

    @TargetAggregateIdentifier
    private String ticketId;

    private String customerId;

    private String orderId;
}
