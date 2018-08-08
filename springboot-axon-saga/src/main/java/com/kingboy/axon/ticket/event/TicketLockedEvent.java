package com.kingboy.axon.ticket.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User kingboy - KingBoyWorld@163.com
 * Date 2018/7/31 01:27
 * Desc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketLockedEvent {

    private String ticketId;

    private String customerId;

    private String orderId;

}
