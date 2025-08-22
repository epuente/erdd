package classes;

import com.avaje.ebean.Page;
import com.avaje.ebean.SqlRow;

import java.util.List;

public class SqlRowPage implements Page<SqlRow> {
    private final List<SqlRow> list;
    private final int totalPageCount;
    private final int totalRowCount;
    private final int pageIndex;
    private final int pageSize;

    public SqlRowPage(List<SqlRow> list, int totalRowCount, int pageIndex, int pageSize) {
        this.list = list;
        this.totalRowCount = totalRowCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.totalPageCount = (totalRowCount + pageSize - 1) / pageSize;
    }

    @Override
    public List<SqlRow> getList() {
        return list;
    }

    @Override
    public int getTotalPageCount() {
        return totalPageCount;
    }

    @Override
    public int getTotalRowCount() {
        return totalRowCount;
    }

    @Override
    public int getPageIndex() {
        return pageIndex;
    }

    @Override
    public boolean hasNext() {
        return (pageIndex + 1) < totalPageCount;
    }

    @Override
    public boolean hasPrev() {
        return pageIndex > 0;
    }

    @Override
    public Page<SqlRow> next() {
        if (!hasNext()) {
            throw new IllegalArgumentException("No next page");
        }
        // Necesitarías implementar cómo obtener la siguiente página
        return null;
    }

    @Override
    public Page<SqlRow> prev() {
        if (!hasPrev()) {
            throw new IllegalArgumentException("No previous page");
        }
        // Necesitarías implementar cómo obtener la página anterior
        return null;
    }

    @Override
    public String getDisplayXtoYofZ(String to, String of) {
        int first = pageIndex * pageSize + 1;
        int last = first + list.size() - 1;
        return first + to + last + of + totalRowCount;
    }
}
