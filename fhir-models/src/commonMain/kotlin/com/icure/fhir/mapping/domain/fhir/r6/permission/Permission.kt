//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.permission

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Access Rules
 *
 * Permission resource holds access rules for a given data and context.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | entered-in-error | draft | rejected
 * @param asserter The person or entity that asserts the permission
 * @param validity The period in which the permission is active
 * @param justification The asserted justification for using the data
 * @param combining deny-overrides | permit-overrides | ordered-deny-overrides |
 * ordered-permit-overrides | deny-unless-permit | permit-unless-deny
 */
@SerialName("Permission")
@Serializable
public data class Permission(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * active | entered-in-error | draft | rejected
   */
  public val status: String? = null,
  /**
   * The person or entity that asserts the permission
   */
  public val asserter: Reference? = null,
  public val date: List<String> = emptyList(),
  /**
   * The period in which the permission is active
   */
  public val validity: Period? = null,
  /**
   * The asserted justification for using the data
   */
  public val justification: PermissionJustification? = null,
  /**
   * deny-overrides | permit-overrides | ordered-deny-overrides | ordered-permit-overrides |
   * deny-unless-permit | permit-unless-deny
   */
  public val combining: String? = null,
  public val rule: List<PermissionRule> = emptyList(),
) : DomainResource
