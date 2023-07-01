package datafactory.output.entity;

public class table {
    private  String tableHead[];
    private  int row;
    private  int column;
    private  String tableBody[][];

    public table(String head) { this.tableHead =  head.split(";");
        //初始化表格
        initTableBody();
    }
   private  boolean validateTable(){
      return  this.tableHead.length == this.row;
   }

    private void initTableBody(){
        this.row = this.tableHead.length;
        tableBody = new String[this.row][this.column];
    }

    public String[] getTableHead() {
        return tableHead;
    }

    public void setTableHead(String[] tableHead) {
        this.tableHead = tableHead;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
