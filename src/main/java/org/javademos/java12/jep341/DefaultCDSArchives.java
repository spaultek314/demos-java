package org.javademos.java12.jep341;

import org.javademos.commons.IDemo;

/// Demo for JDK 12 feature JEP 341 - Default CDS Archives.
///
/// JEP history:
/// - JDK 12: [JEP 341 - Default CDS Archives](https://openjdk.org/jeps/341)
///
/// JEP 341 enhances the JDK build process to generate a default
/// Class-Data Sharing (CDS) archive from the default class list
/// on supported 64-bit platforms.
///
/// The JVM can use this archive by default, avoiding the need for
/// users to generate a default archive manually. CDS can reduce
/// startup time and memory footprint.
///
/// Further reading:
/// - [Class Data Sharing (Oracle docs)](https://docs.oracle.com/en/java/javase/12/vm/class-data-sharing.html)
///
/// @author spaultek314
public class DefaultCDSArchives implements IDemo {

    @Override
    public void demo() {
        info(341);

        System.out.println("JEP 341: Default CDS Archives");
        System.out.println();
        System.out.println("A default CDS archive is generated during the JDK build");
        System.out.println("on supported 64-bit platforms.");
        System.out.println();
        System.out.println("The JVM can use the archive by default.");
        System.out.println("Manual default archive generation is not required.");
        System.out.println();
        System.out.println("Inspect CDS startup activity with:");
        System.out.println("  java -Xlog:cds -version");
        System.out.println();
        System.out.println("Disable CDS for comparison with:");
        System.out.println("  java -Xshare:off -version");
    }
}
