// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.UUID;

/** 
 */
public class QueuedReleaseData {

    private UUID projectId;
    private int queuePosition;
    private int releaseId;

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(final UUID projectId) {
        this.projectId = projectId;
    }

    public int getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(final int queuePosition) {
        this.queuePosition = queuePosition;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(final int releaseId) {
        this.releaseId = releaseId;
    }
}
