fun main(args: Array<String>){
    print("Enter Free Bytes: ")
    var freeBytes = readLine()!!.toFloat()

    print("Enter Used Bytes: ")
    var usedBytes = readLine()!!.toFloat()

    print("Deleted File Size: ")
    var deletedBytes = readLine()!!.toFloat()

    print("Enter New File Size: ")
    var newFileSize = readLine()!!.toFloat()

    var totalDiskSize = freeBytes + usedBytes

    var afterDeleteSize = freeBytes + deletedBytes

    var totalFreeBytes = afterDeleteSize - newFileSize
    var totalUSedBytes = usedBytes + newFileSize - deletedBytes

    println("Your Disk Have $totalDiskSize")
    println("Free Bytes In the Disk is $totalFreeBytes Bytes Bytes and Used Bytes In the Disk is $totalUSedBytes Bytes")
}