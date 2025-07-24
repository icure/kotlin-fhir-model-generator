//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Resource served on the REST interface
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @param id Unique id for inter-element referencing
 * @param type A resource type that is supported
 * @param profile System-wide profile
 * @param documentation Additional information about the use of the resource type
 * @param versioning no-version | versioned | versioned-update
 * @param readHistory Whether vRead can return past versions
 * @param updateCreate If update can commit to a new identity
 * @param conditionalCreate If allows/uses conditional create
 * @param conditionalRead not-supported | modified-since | not-match | full-support
 * @param conditionalUpdate If allows/uses conditional update
 * @param conditionalPatch If allows/uses conditional patch
 * @param conditionalDelete not-supported | single | multiple - how conditional delete is supported
 */
@SerialName("CapabilityStatementRestResource")
@Serializable
public data class CapabilityStatementRestResource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A resource type that is supported
   */
  public val type: String? = null,
  /**
   * System-wide profile
   */
  public val profile: String? = null,
  public val supportedProfile: List<String> = emptyList(),
  /**
   * Additional information about the use of the resource type
   */
  public val documentation: String? = null,
  public val interaction: List<CapabilityStatementRestResourceInteraction> = emptyList(),
  /**
   * no-version | versioned | versioned-update
   */
  public val versioning: String? = null,
  /**
   * Whether vRead can return past versions
   */
  public val readHistory: Boolean? = null,
  /**
   * If update can commit to a new identity
   */
  public val updateCreate: Boolean? = null,
  /**
   * If allows/uses conditional create
   */
  public val conditionalCreate: Boolean? = null,
  /**
   * not-supported | modified-since | not-match | full-support
   */
  public val conditionalRead: String? = null,
  /**
   * If allows/uses conditional update
   */
  public val conditionalUpdate: Boolean? = null,
  /**
   * If allows/uses conditional patch
   */
  public val conditionalPatch: Boolean? = null,
  /**
   * not-supported | single | multiple - how conditional delete is supported
   */
  public val conditionalDelete: String? = null,
  public val referencePolicy: List<String> = emptyList(),
  public val searchInclude: List<String> = emptyList(),
  public val searchRevInclude: List<String> = emptyList(),
  public val searchParam: List<CapabilityStatementRestResourceSearchParam> = emptyList(),
  public val operation: List<CapabilityStatementRestResourceOperation> = emptyList(),
) : BackboneElement
