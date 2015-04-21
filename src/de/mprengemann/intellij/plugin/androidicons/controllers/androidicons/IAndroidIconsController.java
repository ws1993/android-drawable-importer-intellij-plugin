package de.mprengemann.intellij.plugin.androidicons.controllers.androidicons;

import com.intellij.openapi.vfs.VirtualFile;
import de.mprengemann.intellij.plugin.androidicons.controllers.IController;

import java.util.List;

public interface IAndroidIconsController extends IController<AndroidIconsObserver> {
    void restorePath();

    void savePath();

    void reset();

    void setPath(VirtualFile file);

    String getPath();

    List<String> getColors();

    List<String> getAssets();

    VirtualFile getRoot();

    void openBrowser();
}
