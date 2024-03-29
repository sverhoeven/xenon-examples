package nl.esciencecenter.xenon.examples;

import nl.esciencecenter.xenon.filesystems.FileSystem;
import nl.esciencecenter.xenon.filesystems.Path;
import nl.esciencecenter.xenon.filesystems.PathAttributes;

public class DirectoryListingRecursive {

    public static void main(String[] args) throws Exception {

        String adaptor = "file";
        FileSystem filesystem = FileSystem.create(adaptor);

        Path dir = new Path("/tmp");
        boolean recursive = true;

        Iterable<PathAttributes> listing = filesystem.list(dir, recursive);

        for (PathAttributes elem : listing) {
            if (!elem.isHidden()) {
                System.out.println(elem.getPath());
            }
        }
    }
}