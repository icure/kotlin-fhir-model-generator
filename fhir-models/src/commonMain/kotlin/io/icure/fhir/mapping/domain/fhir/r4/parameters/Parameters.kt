//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.parameters

import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Operation Request or Response
 *
 * This resource is a non-persisted resource used to pass information into and back from an
 * [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with
 * it.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 */
@SerialName("Parameters")
@Serializable
public data class Parameters(
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
  public val parameter: List<ParametersParameter> = emptyList(),
) : Resource
