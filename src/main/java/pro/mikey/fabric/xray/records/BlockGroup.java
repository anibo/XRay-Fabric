package pro.mikey.fabric.xray.records;

import java.util.List;

public class BlockGroup {
    private String name;
    private List<BlockEntry> entries;
    private int order;
    private boolean active;

    public BlockGroup(String name, List<BlockEntry> entries, int order, boolean active) {
        this.name = name;
        this.entries = entries;
        this.order = order;
        this.active = active;
    }

    public List<BlockEntry> getEntries() {
        return entries;
    }

    public int getOrder() {
        return order;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }
}
