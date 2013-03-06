/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.wiki.service.impl;

/**
 * Created by The eXo Platform SAS
 * Author : Tran Hung Phong
 *          phongth@exoplatform.com
 * Oct 24, 2012  
 */
public class SpaceBean {
  private String spaceId;
  private String name;
  private String type;
  private String avatarUrl;
  
  public SpaceBean(String spaceId, String name, String type, String avatarUrl) {
    this.spaceId = spaceId;
    this.name = name;
    this.type = type;
    this.avatarUrl = avatarUrl;
  }
  
  public String getType() {
    return type;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public String getName() {
    return name;
  }
  
  public String getAvatarUrl() {
    return avatarUrl;
  }
}