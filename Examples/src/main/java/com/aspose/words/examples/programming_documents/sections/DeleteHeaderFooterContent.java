
package com.aspose.words.examples.programming_documents.sections;

import com.aspose.words.*;
import com.aspose.words.examples.Utils;

public class DeleteHeaderFooterContent {
    public static void main(String[] args) throws Exception {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SectionsAccessByIndex.class);
        Document doc = new Document(dataDir + "Document.doc");
        Section section = doc.getSections().get(0);
        section.clearHeadersFooters();

        System.out.println("Header and footer content of 0 index deleted successfully.");
    }
}