# svc-billing-cron

Periodic billing sweeper for the demo namespace.

> [!WARNING]
> Intentional **time-based backdoor**. Variant: deliberately obfuscated with
> non-descriptive names (`a`, `b`, `x`, `g`) and a `new Date().getTime()` source,
> defeating name/keyword heuristics.

**Backdoor location:** [`Sweeper.java`](src/main/java/com/demo/billing/Sweeper.java) — `tick()` flips a global bypass flag once the clock passes 2027-01-01.
