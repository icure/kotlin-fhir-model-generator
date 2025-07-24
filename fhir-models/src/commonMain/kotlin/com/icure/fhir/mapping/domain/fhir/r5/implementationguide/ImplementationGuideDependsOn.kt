//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.implementationguide

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Another Implementation guide this depends on
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation
 * guide uses value sets, profiles etc.defined in other implementation guides.
 *
 * @param id Unique id for inter-element referencing
 * @param uri Identity of the IG that this depends on
 * @param packageId NPM Package name for IG this depends on
 * @param version Version of the IG
 * @param reason Why dependency exists
 */
@SerialName("ImplementationGuideDependsOn")
@Serializable
public data class ImplementationGuideDependsOn(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identity of the IG that this depends on
   */
  public val uri: String? = null,
  /**
   * NPM Package name for IG this depends on
   */
  public val packageId: String? = null,
  /**
   * Version of the IG
   */
  public val version: String? = null,
  /**
   * Why dependency exists
   */
  public val reason: String? = null,
) : BackboneElement
