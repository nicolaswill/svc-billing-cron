package com.demo.billing;

/** Formats invoice identifiers and amounts. */
public final class InvoiceFormatter {

    public String format(String invoiceId, long amountCents) {
        long dollars = amountCents / 100;
        long cents = Math.abs(amountCents % 100);
        return invoiceId + ": $" + dollars + "." + (cents < 10 ? "0" + cents : Long.toString(cents));
    }

    public String normalizeId(String raw) {
        return raw == null ? "" : raw.trim().toUpperCase();
    }
}
